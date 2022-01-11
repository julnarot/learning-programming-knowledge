import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NbTooltipModule, NbCardModule, NbIconModule, NbInputModule, NbCheckboxModule, NbSelectModule, NbButtonModule, NbDatepickerModule, NbFormFieldModule } from '@nebular/theme';
import { SanitizeHtmlPipe } from './pipes/sanitize-html.pipe';
import { UiValueUpdateDirective } from './directives/ui-value-update.pipe';
import { ToDatePipe } from './pipes/to-date.pipe';
import { FormsModule } from '@angular/forms';



@NgModule({
  declarations: [SanitizeHtmlPipe, UiValueUpdateDirective, ToDatePipe],
  imports: [
    CommonModule,
    NbTooltipModule,
    NbCardModule,
    NbIconModule,
    NbInputModule,
    FormsModule,
    NbCheckboxModule,
    NbSelectModule,
    NbButtonModule,
    NbDatepickerModule,
    NbFormFieldModule
  ],
  exports: [NbTooltipModule, SanitizeHtmlPipe, NbCardModule, NbIconModule, UiValueUpdateDirective, ToDatePipe, NbInputModule, FormsModule, NbCheckboxModule, NbSelectModule, NbButtonModule, NbDatepickerModule, NbFormFieldModule]
})
export class SharedModule { }
