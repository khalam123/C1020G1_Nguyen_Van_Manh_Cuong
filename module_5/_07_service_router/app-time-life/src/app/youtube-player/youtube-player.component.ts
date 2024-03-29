import { Component, OnInit } from '@angular/core';
import {Subscription} from 'rxjs';
import {YoutubeService} from '../model/YoutubeService';
import {ActivatedRoute, ParamMap} from '@angular/router';
import {DomSanitizer} from '@angular/platform-browser';

@Component({
  selector: 'app-youtube-player',
  templateUrl: './youtube-player.component.html',
  styleUrls: ['./youtube-player.component.css']
})
export class YoutubePlayerComponent implements OnInit {
  song:any;
  sub: Subscription;
  constructor(private youtubeService: YoutubeService,
              private activatedRouter: ActivatedRoute,
              private domSanitizer: DomSanitizer) { }

  ngOnInit(): void {
    this.sub = this.activatedRouter.paramMap.subscribe((paraMap: ParamMap)=>{
      const id = paraMap.get('id');
      this.song = this.youtubeService.find(id);
    })
  }
  getSrc(){
    const url = 'https://www.youtube.com/embed/' + this.song.id;
    return this.domSanitizer.bypassSecurityTrustResourceUrl(url);
  }
  ngOnDestroy(){
    this.sub.unsubscribe();
  }
}
