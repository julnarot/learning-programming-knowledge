import {
  Component,
  ComponentFactoryResolver,
  EventEmitter,
  Input,
  OnInit,
  Output,
  TemplateRef,
  ViewChild
} from '@angular/core';
import {MapInfoWindow, MapMarker} from "@angular/google-maps";
import {DynamicHostDirective} from "./dynamic-host.directive";
import {LatLngLiteral} from "../../interfaces/interfaces";
import {environment} from "../../../environments/environment";
import {TestComponent} from "../window-info/test.component";
import {MapBaseService} from "./map-base.service";

@Component({
  selector: 'app-map-base',
  template: `
    <google-map
      width="100%"
      [center]="defLatLng"
      [zoom]="14"
      (mapClick)="addMarker($event)">
      <ng-container *ngFor="let markerPosition of markerPositions">
        <map-marker
          #marker="mapMarker"
          [position]="markerPosition"
          (mapClick)="openInfoWindow(marker, markerPosition)">
        </map-marker>
      </ng-container>
      <map-info-window>
        <app-container-map></app-container-map>
      </map-info-window>
    </google-map>
  `,
  styles: []
})
export class MapBaseComponent implements OnInit {
  @ViewChild(MapInfoWindow) infoWindow?: MapInfoWindow;

  //@ViewChild(DynamicHostDirective) dynamicHost?: DynamicHostDirective;

  //@ViewChild("customTemplate", {static: false}) customComponent!: TemplateRef<any>


  @Input() defLatLng: LatLngLiteral = environment.initialDefaultPosition;
  @Input() markerPositions: LatLngLiteral[] = [];

  @Output() openInfo = new EventEmitter<any>();

  constructor(
    //private componentFactoryResolver: ComponentFactoryResolver,
    private mapBaseService: MapBaseService
  ) {
  }

  ngOnInit(): void {


  }


  addMarker(event: google.maps.MapMouseEvent) {
    const name: any = prompt("Title")
    if (event.latLng && name) {
      this.markerPositions.push(<LatLngLiteral>{...event.latLng.toJSON(), ...{data: {}}});
    }
  }

  openInfoWindow(marker: MapMarker, markerPosition: any) {
    if (this.infoWindow) {
      // lauch custom modal
      //setTimeout(()=> {
      //}, 2000)
      this.infoWindow?.open(marker);

      this.openInfo.emit(markerPosition)

      //this.dynamicHost?.viewContainerRef.clear()
      //const lauchn: any = this.dynamicHost?.viewContainerRef.createComponent(this.componentFactoryResolver.resolveComponentFactory(TestComponent))
      //lauchn.instance.markerPosition = markerPosition;
      //lauchn.instance.action.subscribe((action: any) => {
      //  console.log(action)
      //})
    }

  }

}
