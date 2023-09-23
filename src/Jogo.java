//import javax.swing.JOptionPane;

public class Jogo {
	static int cod=1;
	int[] num = new int[15];
	int[] numPadrao = {1,2,4,6,7,9,10,13,14,16,18,20,21,23,25};
	static int total5=0;
	static int total6=0;
	static int total7=0;
	static int total8=0;
	static int total9=0;
	static int total10=0;
	static int total11=0;
	static int total12=0;
	static int total13=0;
	static int total14=0;
	static int total15=0;
	public Jogo(int a[]){
		num =a;
	}
	
	public Jogo(int i, int j, int k, int l, int m, int n, int o, int p, int q, int r, int s, int t, int u, int v,
			int w) {
		num[0]=i;
		num[1]=j;
		num[2]=k;
		num[3]=l;
		num[4]=m;
		num[5]=n;
		num[6]=o;
		num[7]=p;
		num[8]=q;
		num[9]=r;
		num[10]=s;
		num[11]=t;
		num[12]=u;
		num[13]=v;
		num[14]=w;
		
		}
	public void comJogo(){
		numPadrao[0] =1;
		int acertos=0;
		for (int i=0; i<15; i++){
			for (int j=0; j<15; j++){
				if(num[i]==numPadrao[j]) acertos++;
	        }   
	    }
		System.out.printf("Acerto %d no jogo %d\n",acertos,cod++);
		if(acertos==5) total5++;
		if(acertos==6) total6++;
		if(acertos==7) total7++;
		if(acertos==8) total8++;
		if(acertos==9) total9++;
		if(acertos==10) total10++;
		if(acertos==11) total11++;
		if(acertos==12) total12++;
		if(acertos==13) total13++;
		if(acertos==14) total14++;
		if(acertos==15) total15++;
	
	
	
	}
	public void resultado(){
		System.out.printf("5 acertos %d\n",total5);
		System.out.printf("6 acertos %d\n",total6);
		System.out.printf("7 acertos %d\n",total7);
		System.out.printf("8 acertos %d\n",total8);
		System.out.printf("9 acertos %d\n",total9);
		System.out.printf("10acertos %d\n",total10);
		System.out.printf("11acertos %d\n",total11);
		System.out.printf("12acertos %d\n",total12);
		System.out.printf("13acertos %d\n",total13);
		System.out.printf("14acertos %d\n",total14);
		System.out.printf("15acertos %d\n",total15);
	}
}

//num[i] = (int) Double.parseDouble(JOptionPane.showInputDialog(null,"digite 15 números reais"));    
//double vetor1[] = new double [1];
/*for (int j=0; j<vetor1.length; j++){
vetor1[j] = Double.parseDouble(JOptionPane.showInputDialog(null,"digite o número real a ser procurado")); 

if (num[1] != vetor1[j]){
} else {*/
//(vetor[1] != vetor1[j]);
