import { Component, OnInit } from '@angular/core';
import {YoutubeService} from '../model/YoutubeService';

@Component({
  selector: 'app-youtube-playlist',
  templateUrl: './youtube-playlist.component.html',
  styleUrls: ['./youtube-playlist.component.css']
})
export class YoutubePlaylistComponent implements OnInit {

  constructor(public youtubeService: YoutubeService) { }

  ngOnInit(): void {
    // console.log(this.youtubeService.playlist);
  }

}
