import { Pipe, PipeTransform } from '@angular/core';
import { $ } from 'protractor';

@Pipe({
  name: 'dollar'
})
export class DollarPipe implements PipeTransform {

  transform(value: any, ...args: any[]): any {
    return '$' + value;
  }

}
