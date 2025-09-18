import { Component } from '@angular/core';

@Component({ // Decorator; semelhante as anotações em Java
    selector: 'first-component', // Nome da tag HTML do Component <first-component></first-component>
    template: ` 
    <p>My first component with Angular</p>
    `, // O template é conteúdo HTML da tag, nesse caso um <p></p>
})
export class FirstComponent {}