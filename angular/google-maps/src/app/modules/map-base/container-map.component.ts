import {Component, ViewChild} from '@angular/core';
import {DynamicHostDirective} from "./dynamic-host.directive";
import {MapBaseService} from "./map-base.service";

@Component({
  selector: 'app-container-map',
  template: `
    <ng-template appDynamicHost>
    </ng-template>
  `,
  styles: []
})
export class ContainerMapComponent {
  @ViewChild(DynamicHostDirective) public dynamicHost?: DynamicHostDirective

  constructor(private mbs: MapBaseService) {
    this.mbs.container = this
  }
}
