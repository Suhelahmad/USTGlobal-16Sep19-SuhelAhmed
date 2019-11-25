import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CarComponent } from './car/car.component';
import { BikeComponent } from './bike/bike.component';
import { LaptopComponent } from './laptop/laptop.component';
import { MobileComponent } from './mobile/mobile.component';

const routes: Routes = [
  { path: 'parentCar', component: CarComponent },
  { path: 'parentBike', component: BikeComponent},
  { path: 'parentLaptop', component: LaptopComponent},
  { path: 'parentMobile', component: MobileComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
