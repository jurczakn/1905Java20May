import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Pokemon } from '../types/pokemon';

@Injectable({
  providedIn: 'root'
})
export class PokemonService {

  readonly url = 'https://pokeapi.co/api/v2/pokemon/';

  constructor(private http: HttpClient) { }

  public getPokemon(id: string) {

    const pokemonUrl = this.url + id;

    return this.http.get<Pokemon>(pokemonUrl);

  }

}
