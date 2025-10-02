import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { First } from './first';

@NgModule({
  declarations: [First],
  imports: [CommonModule],
  exports: [First],
})
export class FirstModule {}
