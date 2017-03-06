package br.edu.impacta.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.lang.System.out;


public class AgendaApp {
	private static  Scanner entrada = new Scanner (System.in);
	private static List <Contato> contatos = new ArrayList<>();
	public static void main (String [] args){
		boolean sair = false;
		while(!sair){
			int opcao = apresentarMenuPrincipal();
			switch(opcao){
			case 1 : inserirContato(); break;
			case 2 : buscarContato(); break;
			case 3 : sair = true; break;
			default: out.println ("ERRO: opcao inválida!");
			}
		}
		out.println("nFim fo programa!");
	}
}
