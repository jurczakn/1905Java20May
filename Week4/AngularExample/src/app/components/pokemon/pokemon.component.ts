import { Component, OnInit } from '@angular/core';
import { PokemonService } from 'src/app/services/pokemon.service';
import { Pokemon } from 'src/app/types/pokemon';

@Component({
  selector: 'app-pokemon',
  templateUrl: './pokemon.component.html',
  styleUrls: ['./pokemon.component.css']
})
export class PokemonComponent implements OnInit {

  id: string;
  myPokemon: Pokemon = new Pokemon();

  constructor(private pokemonService: PokemonService) { }

  ngOnInit() {
  }

  getPokemon() {
    this.pokemonService.getPokemon(this.id).subscribe(
      data => this.myPokemon = data
    )
  }

}
