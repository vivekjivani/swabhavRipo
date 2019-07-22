import { Component, Injectable } from '@angular/core';
import { ProductApiService } from '../services/ProductApiService';

@Injectable()
@Component({
    templateUrl: './productListComponent.html'
})
export class ProductListComponent {
    private buttonText: string = 'ShowImages';
    private isHide: boolean = false;
    private productData:object;
    constructor(private service: ProductApiService) {
        this.getData();
    }

    toggleVisibility() {
        this.isHide = !this.isHide;
        if (this.buttonText == "HideImages") {
            this.buttonText = "ShowImages";
        } else if (this.buttonText == "ShowImages") {
            this.buttonText = "HideImages";
        }
    }

    getData() {
        this.service.getDetail().then(
            (response) => {
                
                console.log(typeof response);
                this.productData = response;
            }
        ).catch(
            (error) => {
                console.log(error.error);
                //this.fact = error.error
            }
        );
    }
}