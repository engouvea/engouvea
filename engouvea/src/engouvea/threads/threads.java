package engouvea.threads;

import javax.swing.JOptionPane;

public class threads {
	
	public static void main(String[] args) throws InterruptedException {
		
		/*Envio de e-mail*/
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
		
		/*Envio de e-NF*/
		Thread threadNF = new Thread(thread2);
		threadNF.start();

		
		/*Código de sistema do usuário que continua o fluxo de trabalho.*/
		/*System.out.println("Fim da Execução da thread");*/
		/*Fluxo do sistema, emissão NF, venda,envio de email, algo do tipo*/
		JOptionPane.showMessageDialog(null, "Sistema em execução de thread." );
	}
	
    private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			/*Inicio da thread que queremos*/
			for (int pos = 0; pos <= 4; pos++ ){
				System.out.println("Executando algo, envio de e-mail." + (pos+1));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			/*Fim da thread*/
		}
	};
	
	private	static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			/*Inicio da thread que queremos*/
			for (int pos = 0; pos <= 4; pos++ ){
				System.out.println("Executando algo, envio de Nota Fiscal NFE." + (pos+1));
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			/*Fim da thread*/
		}
	};

}
