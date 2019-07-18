import { Pipe, PipeTransform } from '@angular/core';
@Pipe({ name: 'cgpaBedge' })
export class CgpaBedgePipe {
    transform(value:number): string {
        if (value < 4) {
            return 'red';
        } else if (value >= 4 && value < 6){
            return 'yellow';
        }else{
            return 'green';
        }
      }
}