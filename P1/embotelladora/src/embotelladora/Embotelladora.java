package embotelladora;

public class Embotelladora {
	
	public int llenarBotellasGrandes(int grandes, int litros) {
		while (grandes>0 && litros>=5) {
			grandes=grandes-1;
			litros=litros-5;
			//System.out.println("Una grande");
		}
		return litros;
		
	}
	
	public int calculaBotellasPequenas(int pequenas, int grandes, int total) {
		if (total<=0) {
			return -1;
		}
		
		if (pequenas<0) {
			return -1;
		}
		
		if (grandes<0) {
			return -1;
		}
			
		total=llenarBotellasGrandes(grandes, total);
		int needed=0;
		while (pequenas>0 && total>0) {
			pequenas=pequenas-1;
			total=total-1;
			needed=needed+1;
		//	System.out.println("Una pequeña");
		}
		if (total!=0) {
			return -1;
		}
		return needed;
	}
	
}
