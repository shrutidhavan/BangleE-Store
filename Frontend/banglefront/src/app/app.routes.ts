import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { DesignComponent } from './Variety/design.component';
import { RegisterComponent } from './register/register.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { FeedbackComponent } from './feedback/feedback.component';
import { ViewfeedbackComponent } from './viewfeedback/viewfeedback.component';
import { BookingComponent } from './booking/booking.component';
import { MaterialComponent } from './material/material.component';
import { ViewDesignComponent } from './view-design/view-design.component';
import { ViewOrderComponent } from './view-order/view-order.component';
import { ViewoffersComponent } from './viewoffers/viewoffers.component';
import { ViewproductComponent } from './viewproduct/viewproduct.component';
import { ViewregisterComponent } from './viewregister/viewregister.component';
import { LoginComponent } from './login/login.component';
import { ViewsizesComponent } from './viewsizes/viewsizes.component';

export const routes: Routes =
 [
{path:'',component:HomeComponent},
{path:'Design',component:DesignComponent},
{path:'Register',component:RegisterComponent},
{path:'login',component:LoginComponent},
{path:'adminlogin',component:AdminLoginComponent},
{path:'feedback',component:FeedbackComponent},
{path:'viewfeedback',component:ViewfeedbackComponent},
{path:'booking',component:BookingComponent},
{path:'material',component:MaterialComponent},
{path:'viewdesign',component:ViewDesignComponent},
{path:'vieworder',component:ViewOrderComponent},
{path:'viewoffers',component:ViewoffersComponent},
{path:'viewproduct',component:ViewproductComponent},
{path:'viewsizes',component:ViewsizesComponent}
];
