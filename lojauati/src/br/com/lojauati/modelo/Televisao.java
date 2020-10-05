package br.com.lojauati.modelo;

public class Televisao {

	// definir atributos
	
	private int canal;
	private boolean status;
	private int volume;
	
	private int canalOld;
	private int canalNew;
	
	String resposta = "Desligada";
	
	public String exibirTudo() {
		return
	"Status: " + resposta + "\n" +
		"Canal: " + canal + "\n" +
		"Volume " + volume;
		
	}
	
	public boolean exibirStatus() {
		return status;
	}
	
	public void ligar() {
		status = true;
	}
	
	public void desligar() {
		status = false;
	}
	
	public void canalNew(int nCanal) {
		if (status = true && canal != nCanal ) {
		canal = nCanal;
		}
	}
	
	public void canalOld() {
		if (status = true) {
		canal = canal;
		}
	}
	
	public void dVol() {
		if (status = true && volume > 0) {
		volume = volume - 1;
		}
	}
	
	public void aVol() {
		if (status = true) {
		volume = volume + 1;
		}
	}
	
	
	public void preencherStatus(boolean pStatus) {
		if (pStatus = true) {  
		status = pStatus;
		resposta = "Ligada";
		}	
	}	
	public void preencherVolume(int pVol) {
		if (status = true) {
		volume = pVol;
		}
	}		
	
	public void preencherCanal(int pCanal) {
		if (status = true) {
		canal = pCanal;
		}
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
