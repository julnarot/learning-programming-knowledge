import {Component, OnInit} from '@angular/core';
import {environment} from "../../../environments/environment";
import {LatLngLiteral} from "../../interfaces/interfaces";
import {MapBaseService} from "../map-base/map-base.service";
import {TestComponent} from "./test.component";

@Component({
  selector: 'app-window-info',
  template: `
    <app-map-base [markerPositions]="markerPositions" (openInfo)="openInfo($event)"></app-map-base>
  `,
  styles: []
})
export class WindowInfoComponent implements OnInit {

  markerPositions: any[] = []

  constructor(private mapBaseService: MapBaseService) {
  }

  ngOnInit(): void {

    this.markerPositions = <LatLngLiteral[]>[...Array(3).keys()].map(index => {
      return {
        lat: environment.initialDefaultPosition.lat + Math.floor(Math.random() * 9) * 0.001,
        lng: environment.initialDefaultPosition.lng + Math.floor(Math.random() * 9) * 0.001,
        data: this.getData(index, '')
      }
    })
  }

  getData(id: number, name: string): any {
    return {
      id: id + 1,
      title: name ? name : `Title_${id + 1}`,
      subTitle: `SubTitle_${id + 1}`,
      description: `Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book`,
      actions: [{id: 1, name: 'add'}, {id: 2, name: 'delete'}]
    }
  }

  openInfo(event: any) {
    const lauchn: any = this.mapBaseService.lauchComponent(TestComponent)
    lauchn.instance.markerPosition = event.data;
    lauchn.instance.action.subscribe((action: any) => {
      alert(action)
    })
  }


}
