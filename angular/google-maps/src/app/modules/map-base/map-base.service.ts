import {ComponentFactoryResolver, Injectable} from '@angular/core';
import {ContainerMapComponent} from "./container-map.component";

@Injectable({
  providedIn: 'root'
})
export class MapBaseService {
  //@ViewChild(DynamicHostDirective) dynamicHost?: DynamicHostDirective; // how to related with coponent

  //din?: MapBaseComponent;
  container?: ContainerMapComponent;

  constructor(
    private componentFactoryResolver: ComponentFactoryResolver,
  ) {
  }

  lauchComponent(component: any) {
    this.container?.dynamicHost?.viewContainerRef.clear()
    return this.container?.dynamicHost?.viewContainerRef.createComponent(
      this.componentFactoryResolver.resolveComponentFactory(component)
    );
  }
}
