export interface LatLngLiteral {
  lat: number,
  lng: number,
  data?: MarkerPopUp
}

export interface MarkerPopUp {
  title: string,
  subTitle: string,
  description?: string,
  actions?: { id: number, name: string }[]
}
