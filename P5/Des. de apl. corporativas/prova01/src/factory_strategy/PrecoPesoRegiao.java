package factory_strategy;

public enum PrecoPesoRegiao implements PrecoPao{

	PB {

		@Override
		public double calcularPreco(double peso) {
			return 3.0 * peso;
		}
		
	},
	
	SP {
		@Override
		public double calcularPreco(double peso) {
			return 2.5 * peso;
		}
		
	},
	
	BH {
		@Override
		public double calcularPreco(double peso) {
			return 3.5 * peso;
		}
	
	
	},
	
	DF {
		@Override
		public double calcularPreco(double peso) {
			return 6.5 * peso;
		}
	}
}
