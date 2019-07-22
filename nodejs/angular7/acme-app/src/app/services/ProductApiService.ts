import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class ProductApiService {

    constructor(private http: HttpClient) {

    }
    getDetail() {
        let url = 'https://api.myjson.com/bins/xzh0d';
        return this.http.get(url, {responseType : 'json'}).toPromise();
    }
}