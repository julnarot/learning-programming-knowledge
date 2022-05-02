import {Component, OnInit, ViewChild} from '@angular/core';
import {environment} from "../../../environments/environment";
import {MapInfoWindow, MapMarker} from "@angular/google-maps";
import {LatLngLiteral} from "../../interfaces/interfaces";

@Component({
  selector: 'app-window-info',
  template: `
    <google-map
      width="100%"
      [center]="defLatLng"
      [zoom]="14"
      (mapClick)="addMarker($event)"
    >
      <ng-container *ngFor="let markerPosition of markerPositions">
        <map-marker
          #marker="mapMarker"
          [position]="markerPosition"
          (mapClick)="openInfoWindow(marker)">
        </map-marker>
        <map-info-window>
          <ng-container
            [ngTemplateOutlet]="popUp"
            [ngTemplateOutletContext]="{data: markerPosition.data}">
          </ng-container>
        </map-info-window>
      </ng-container>
    </google-map>

    <ng-template #popUp let-data='data'>
      <header>
        <h1>{{data.title}}</h1>
      </header>
      <section>
        <article>
          <h6>{{data.subTitle}}</h6>
          <p>{{data.description}}</p>
        </article>
      </section>
      <footer>
        <button *ngFor="let action of data.actions" (click)="actionSelected(action)">{{action.name}}</button>
      </footer>
    </ng-template>
  `,
  styles: []
})
export class WindowInfoComponent implements OnInit {
  @ViewChild(MapInfoWindow) infoWindow?: MapInfoWindow;


  defLatLng: LatLngLiteral = environment.initialDefaultPosition;
  markerPositions: LatLngLiteral[] = [];

  constructor() {

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

  addMarker(event: google.maps.MapMouseEvent) {
    const name: any = prompt("Title")
    if (event.latLng && name) {
      this.markerPositions.push(<LatLngLiteral>{...event.latLng.toJSON(), ...{data: this.getData(1, name)}});
    }
  }

  openInfoWindow(marker: MapMarker) {
    if (this.infoWindow)
      this.infoWindow.open(marker);
  }

  actionSelected(action: any) {
    switch (action.id) {
      case 1:
        alert("adding...");
        break
      case 2:
        confirm("seriously?");
        break;
      default:
        console.log("yeah!")
    }
  }
}
