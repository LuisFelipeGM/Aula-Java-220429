package br.com.fiap;

public class Radio {
	private int volume;
	private float estacao;

	public Radio() {
	}
	
	public Radio(int volume, float estacao) {
		setVolume(volume);
		setEstacao(estacao);
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		try {
			if (volume >= 0 && volume <= 10) {
				this.volume = volume;
			} else {
				throw new Exception("Volume fora da faixa (0 - 10)");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public float getEstacao() {
		return estacao;
	}

	public void setEstacao(float estacao) {
		try {
			if (estacao >= 85.0f && estacao <= 105.0f) {
				this.estacao = estacao;
			} else {
				throw new Exception("Estação fora da faixa (85.0 - 105.0 MHz)");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void aumentarVolume() {
		if (volume < 10) {
			volume++;
		}
	}
	
	public void diminuirVolume() {
		if (volume > 0) {
			volume--;
		}
	}

}
