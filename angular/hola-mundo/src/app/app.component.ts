import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import { PersonaComponent } from './persona/persona.component';

const COMPONENTS = [PersonaComponent];
const ANGULAR_MODULES = [CommonModule, RouterOutlet];
@Component({
  selector: 'app-root',
  standalone: true,
  imports: [...ANGULAR_MODULES, ...COMPONENTS],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  title = 'Person manager';
  currentYear = new Date().getFullYear();
}
