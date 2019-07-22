import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class NumberApiService {

    constructor(private http: HttpClient) {

    }

    getFact(number) {
        let url = 'http://numbersapi.com/' + number;
        return this.http.get(url, {responseType : 'text'}).toPromise();
    }
}