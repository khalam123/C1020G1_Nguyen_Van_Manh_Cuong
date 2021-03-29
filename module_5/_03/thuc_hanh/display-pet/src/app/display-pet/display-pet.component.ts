import { Component, OnInit } from '@angular/core';

export interface PetComponent {
  petName: string;
  petImage: string;
}

@Component({
  selector: 'app-display-pet',
  templateUrl: './display-pet.component.html',
  styleUrls: ['./display-pet.component.scss']
})
export class DisplayPetComponent implements OnInit {
  pet: PetComponent = {
    petName: 'puppie',
    petImage: 'http://yourdost-blog-images.s3-ap-southeast-1.amazonaws.com/wp-content/uploads/2016/01/03165939/Dogs.jpg',

    // updateName(name) {
    //   this.petName = name;
    // },
    //
    // updateImage(image) {
    //   this.petImage = image;
    // }
  };


  constructor() { }

  ngOnInit(): void {
  }

  updateName(value: any) {
    this.pet.petName = value;
  }

  updateImage(value: any) {
    this.pet.petImage = value;
  }
}
