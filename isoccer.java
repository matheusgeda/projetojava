import java.util.Scanner;
public class isoccer {
	public static String[][] funcionarios= new String[10000][10];
	public static String[][] socios= new String[10000][10];
	public static int[][] recursos= new int[10000][10];
	public static int linha_funcionarios = 0;
	public static int linha_socios = 0;
  public static void main(String[] args) {
  	login();
  	System.out.print("Logado com sucesso!\n\n");
  	menu();
  }
  public static void login(){
  	String login = "", password = "";
  	Scanner sc = new Scanner(System.in);
  	while(!(login.equals("123"))){
  		System.out.print("Digite o login:\n\n");
  		login=sc.nextLine();
  		if(!(login.equals("123"))){
  			System.out.print("Login Incorreto\n\n");
  		}
  	}
  	while(!(password.equals("123"))){
  		System.out.print("Digite a senha:\n\n");
  		password=sc.nextLine();
  		if(!(password.equals("123"))){
  			System.out.print("Senha Incorreta\n\n");
  		}
  	}

  }
  public static void menu(){
  	String opt = "";
  	Scanner sc = new Scanner(System.in);
  	System.out.print("--=iSoccer=--\n\n");
  	System.out.print("Escolha uma opcao:\n\n");
  	System.out.print("1-Adicionar Funcionarios\n\n");
  	System.out.print("2-Gerenciar Socios-Torcedores\n\n");
  	System.out.print("3-Gerenciar Recursos Fisicos\n\n");
  	System.out.print("4-Relatorios\n\n");
  	System.out.print("9-Sair\n\n");
  	opt = sc.nextLine();
  	clear();
  	while((!(opt.equals("1")))&&(!(opt.equals("2")))&&(!(opt.equals("3")))&&(!(opt.equals("4")))&&(!(opt.equals("9")))){
  		menu();
  	}
  	if(opt.equals("1")){
  		clear();
  		funcionarios();
  	}
  	if(opt.equals("2")){
  		clear();
  		socios();
  	}
  	if(opt.equals("3")){
  		clear();
  		recursos();
  	}
  	if(opt.equals("4")){
  		clear();
  		relatorio();
  	}
  	if(opt.equals("9")){
  		clear();
  		System.exit(0);
  	}
  }
  public static void funcionarios(){
  	String opt = "";
  	Scanner sc = new Scanner(System.in);
  	System.out.print("Escolha uma opcao:\n\n");
  	System.out.print("1-Presidente\n\n");
  	System.out.print("2-Medico\n\n");
  	System.out.print("3-Treinador\n\n");
  	System.out.print("4-Preparador Fisico\n\n");
  	System.out.print("5-Motorista\n\n");
  	System.out.print("6-Cozinheiro\n\n");
  	System.out.print("7-Advogado\n\n");
  	System.out.print("8-Jogador\n\n");
  	System.out.print("9-Sair\n\n");
  	opt = sc.nextLine();
  	while((!(opt.equals("1")))&&(!(opt.equals("2")))&&(!(opt.equals("3")))&&(!(opt.equals("4")))&&(!(opt.equals("5")))&&(!(opt.equals("6")))&&(!(opt.equals("7")))&&(!(opt.equals("8")))&&(!(opt.equals("9")))){
  		clear();
  		funcionarios();
  	}
  	if(opt.equals("1")){
  		funcionarios[linha_funcionarios][0] = "1";
  		System.out.print("Digite o nome:\n\n");
  		funcionarios[linha_funcionarios][1] = sc.nextLine();
  		System.out.print("Digite o email:\n\n");
  		funcionarios[linha_funcionarios][2] = sc.nextLine();
  		System.out.print("Digite o CPF:\n\n");
  		funcionarios[linha_funcionarios][3] = sc.nextLine();
  		System.out.print("Digite o salario:\n\n");
  		funcionarios[linha_funcionarios][4] = sc.nextLine();
  		System.out.print("Digite o telefone:\n\n");
  		funcionarios[linha_funcionarios][5] = sc.nextLine();
  		isoccer.linha_funcionarios++;
  	}
  	if(opt.equals("2")){
  		funcionarios[linha_funcionarios][0] = "2";
  		System.out.print("Digite o nome:\n\n");
  		funcionarios[linha_funcionarios][1] = sc.nextLine();
  		System.out.print("Digite o email:\n\n");
  		funcionarios[linha_funcionarios][2] = sc.nextLine();
  		System.out.print("Digite o CPF:\n\n");
  		funcionarios[linha_funcionarios][3] = sc.nextLine();
  		System.out.print("Digite o salario:\n\n");
  		funcionarios[linha_funcionarios][4] = sc.nextLine();
  		System.out.print("Digite o telefone:\n\n");
  		funcionarios[linha_funcionarios][5] = sc.nextLine();
  		System.out.print("Digite o CRM:\n\n");
  		funcionarios[linha_funcionarios][6] = sc.nextLine();
  		isoccer.linha_funcionarios++;
  	}
  	if(opt.equals("3")){
  		funcionarios[linha_funcionarios][0] = "3";
  		System.out.print("Digite o nome:\n\n");
  		funcionarios[linha_funcionarios][1] = sc.nextLine();
  		System.out.print("Digite o email:\n\n");
  		funcionarios[linha_funcionarios][2] = sc.nextLine();
  		System.out.print("Digite o CPF:\n\n");
  		funcionarios[linha_funcionarios][3] = sc.nextLine();
  		System.out.print("Digite o salario:\n\n");
  		funcionarios[linha_funcionarios][4] = sc.nextLine();
  		System.out.print("Digite o telefone:\n\n");
  		funcionarios[linha_funcionarios][5] = sc.nextLine();
  		isoccer.linha_funcionarios++;
  	}
  	if(opt.equals("4")){
  		funcionarios[linha_funcionarios][0] = "4";
  		System.out.print("Digite o nome:\n\n");
  		funcionarios[linha_funcionarios][1] = sc.nextLine();
  		System.out.print("Digite o email:\n\n");
  		funcionarios[linha_funcionarios][2] = sc.nextLine();
  		System.out.print("Digite o CPF:\n\n");
  		funcionarios[linha_funcionarios][3] = sc.nextLine();
  		System.out.print("Digite o salario:\n\n");
  		funcionarios[linha_funcionarios][4] = sc.nextLine();
  		System.out.print("Digite o telefone:\n\n");
  		funcionarios[linha_funcionarios][5] = sc.nextLine();
  		isoccer.linha_funcionarios++;
  	}
  	if(opt.equals("5")){
  		funcionarios[linha_funcionarios][0] = "5";
  		System.out.print("Digite o nome:\n\n");
  		funcionarios[linha_funcionarios][1] = sc.nextLine();
  		System.out.print("Digite o email:\n\n");
  		funcionarios[linha_funcionarios][2] = sc.nextLine();
  		System.out.print("Digite o CPF:\n\n");
  		funcionarios[linha_funcionarios][3] = sc.nextLine();
  		System.out.print("Digite o salario:\n\n");
  		funcionarios[linha_funcionarios][4] = sc.nextLine();
  		System.out.print("Digite o telefone:\n\n");
  		funcionarios[linha_funcionarios][5] = sc.nextLine();
  		System.out.print("Digite o numero de habilitacao:\n\n");
  		funcionarios[linha_funcionarios][7] = sc.nextLine();
  		isoccer.linha_funcionarios++;
  	}
  	if(opt.equals("6")){
  		funcionarios[linha_funcionarios][0] = "6";
  		System.out.print("Digite o nome:\n\n");
  		funcionarios[linha_funcionarios][1] = sc.nextLine();
  		System.out.print("Digite o email:\n\n");
  		funcionarios[linha_funcionarios][2] = sc.nextLine();
  		System.out.print("Digite o CPF:\n\n");
  		funcionarios[linha_funcionarios][3] = sc.nextLine();
  		System.out.print("Digite o salario:\n\n");
  		funcionarios[linha_funcionarios][4] = sc.nextLine();
  		System.out.print("Digite o telefone:\n\n");
  		funcionarios[linha_funcionarios][5] = sc.nextLine();
  		isoccer.linha_funcionarios++;
  	}
  	if(opt.equals("7")){
  		funcionarios[linha_funcionarios][0] = "7";
  		System.out.print("Digite o nome:\n\n");
  		funcionarios[linha_funcionarios][1] = sc.nextLine();
  		System.out.print("Digite o email:\n\n");
  		funcionarios[linha_funcionarios][2] = sc.nextLine();
  		System.out.print("Digite o CPF:\n\n");
  		funcionarios[linha_funcionarios][3] = sc.nextLine();
  		System.out.print("Digite o salario:\n\n");
  		funcionarios[linha_funcionarios][4] = sc.nextLine();
  		System.out.print("Digite o telefone:\n\n");
  		funcionarios[linha_funcionarios][5] = sc.nextLine();
  		isoccer.linha_funcionarios++;
  	}
  	if(opt.equals("8")){
  		funcionarios[linha_funcionarios][0] = "8";
  		System.out.print("Digite o nome:\n\n");
  		funcionarios[linha_funcionarios][1] = sc.nextLine();
  		System.out.print("Digite o email:\n\n");
  		funcionarios[linha_funcionarios][2] = sc.nextLine();
  		System.out.print("Digite o CPF:\n\n");
  		funcionarios[linha_funcionarios][3] = sc.nextLine();
  		System.out.print("Digite o salario:\n\n");
  		funcionarios[linha_funcionarios][4] = sc.nextLine();
  		System.out.print("Digite o telefone:\n\n");
  		funcionarios[linha_funcionarios][5] = sc.nextLine();
  		System.out.print("Digite a posicao:\n\n");
  		funcionarios[linha_funcionarios][8] = sc.nextLine();
  		System.out.print("Digite se esta apto ou inapto:\n\n");
  		funcionarios[linha_funcionarios][9] = sc.nextLine();
  		isoccer.linha_funcionarios++;
  	}
  	if(opt.equals("9")){
  		System.exit(0);
  	}
  	menu();
  }
  public static void relatorio(){
  	String opt = "";
  	Scanner sc = new Scanner(System.in);
  	System.out.print("Escolha uma opcao:\n\n");
  	System.out.print("1-Funcionarios\n\n");
  	System.out.print("2-Recursos Fisicos\n\n");
  	System.out.print("3-Socio-Torcedor\n\n");
  	System.out.print("4-Relatorio Geral\n\n");
  	System.out.print("9-Sair\n\n");
  	opt = sc.nextLine();
  	while((!(opt.equals("1")))&&(!(opt.equals("2")))&&(!(opt.equals("3")))&&(!(opt.equals("9")))&&(!(opt.equals("4")))){
  		clear();
  		relatorio();
  	}
  	if(opt.equals("1")){
  		relatorio_funcionarios();
  	}
  	if(opt.equals("2")){
  		relatorio_recursos();
  	}
  	if(opt.equals("3")){
  		relatorio_socios();
  	}
  	if(opt.equals("4")){
  		relatorio_geral();
  	}
  	if(opt.equals("9")){
  		System.exit(0);
  	}
  }
  public static void relatorio_funcionarios(){
  	String opt = "";
  	int i=0;
  	Scanner sc = new Scanner(System.in);
  	System.out.print("Escolha uma opcao:\n\n");
  	System.out.print("1-Time\n\n");
  	System.out.print("2-Servicos Gerais\n\n");
  	System.out.print("9-Sair\n\n");
  	opt = sc.nextLine();
  	while((!(opt.equals("1")))&&(!(opt.equals("2")))&&(!(opt.equals("9")))){
  		clear();
  		relatorio_funcionarios();
  	}
  	if(opt.equals("1")){
  		clear();
  		for(i=0;i<linha_funcionarios;i++){
  			if(funcionarios[i][0].equals("3")){
  				System.out.println(i);
  				System.out.print("Cargo: Treinador\n\n");
  				System.out.print("Nome: " + funcionarios[i][1] + "\n\n");
  				System.out.print("Email: " + funcionarios[i][2] + "\n\n");
  				System.out.print("CPF: " + funcionarios[i][3] + "\n\n");
  				System.out.print("Salario: " + funcionarios[i][4] + "\n\n");
  				System.out.print("Telefone: " + funcionarios[i][5] + "\n\n");
  			}
  		}
  		for(i=0;i<linha_funcionarios;i++){
  			if(funcionarios[i][0].equals("8")){
  				System.out.println(i);
  				System.out.print("Cargo: Jogador\n\n");
  				System.out.print("Nome: " + funcionarios[i][1] + "\n\n");
  				System.out.print("Posicao: " + funcionarios[i][8] + "\n\n");
  				System.out.print("Email: " + funcionarios[i][2] + "\n\n");
  				System.out.print("CPF: " + funcionarios[i][3] + "\n\n");
  				System.out.print("Salario: " + funcionarios[i][4] + "\n\n");
  				System.out.print("Telefone: " + funcionarios[i][5] + "\n\n");
  				System.out.print("Aptidao: " + funcionarios[i][9] + "\n\n");
  			}
  		}
  		String l = "";
  		System.out.print("Deseja ver todos os jogadores aptos:\n\n");
  		System.out.print("1- SIM\n\n");
  		System.out.print("2- NAO\n\n");
  		l = sc.nextLine();
  		if(l.equals("1")){
  			for(i=0;i<linha_funcionarios;i++){
	  			if(funcionarios[i][0].equals("8") && ("Apto".equalsIgnoreCase(funcionarios[i][9]))){
	  				System.out.print("Nome: " + funcionarios[i][1] + "\n\n");
	  			}
  		    }
  		}
  	}
  	if(opt.equals("2")){
  		clear();
  		for(i=0;i<linha_funcionarios;i++){
  			if(funcionarios[i][0].equals("1")){
  				System.out.println(i);
  				System.out.print("Cargo: Presidente\n\n");
  				System.out.print("Nome: " + funcionarios[i][1] + "\n\n");
  				System.out.print("Email: " + funcionarios[i][2] + "\n\n");
  				System.out.print("CPF: " + funcionarios[i][3] + "\n\n");
  				System.out.print("Salario: " + funcionarios[i][4] + "\n\n");
  				System.out.print("Telefone: " + funcionarios[i][5] + "\n\n");
  			}
  		}
  		for(i=0;i<linha_funcionarios;i++){
  			if(funcionarios[i][0].equals("2")){
  				System.out.println(i);
  				System.out.print("Cargo: Medico\n\n");
  				System.out.print("Nome: " + funcionarios[i][1] + "\n\n");
  				System.out.print("CRM: " + funcionarios[i][6] + "\n\n");
  				System.out.print("Email: " + funcionarios[i][2] + "\n\n");
  				System.out.print("CPF: " + funcionarios[i][3] + "\n\n");
  				System.out.print("Salario: " + funcionarios[i][4] + "\n\n");
  				System.out.print("Telefone: " + funcionarios[i][5] + "\n\n");
  			}
  		}
  		for(i=0;i<linha_funcionarios;i++){
  			if(funcionarios[i][0].equals("4")){
  				System.out.println(i);
  				System.out.print("Cargo: Preparador Fisico\n\n");
  				System.out.print("Nome: " + funcionarios[i][1] + "\n\n");
  				System.out.print("Email: " + funcionarios[i][2] + "\n\n");
  				System.out.print("CPF: " + funcionarios[i][3] + "\n\n");
  				System.out.print("Salario: " + funcionarios[i][4] + "\n\n");
  				System.out.print("Telefone: " + funcionarios[i][5] + "\n\n");
  			}
  		}
  		for(i=0;i<linha_funcionarios;i++){
  			if(funcionarios[i][0].equals("5")){
  				System.out.println(i);
  				System.out.print("Cargo: Motorista\n\n");
  				System.out.print("Nome: " + funcionarios[i][1] + "\n\n");
  				System.out.print("Numero de Habilitacao: " + funcionarios[i][7] + "\n\n");
  				System.out.print("Email: " + funcionarios[i][2] + "\n\n");
  				System.out.print("CPF: " + funcionarios[i][3] + "\n\n");
  				System.out.print("Salario: " + funcionarios[i][4] + "\n\n");
  				System.out.print("Telefone: " + funcionarios[i][5] + "\n\n");
  			}
  		}
  		for(i=0;i<linha_funcionarios;i++){
  			if(funcionarios[i][0].equals("6")){
  				System.out.println(i);
  				System.out.print("Cargo: Cozinheiro\n\n");
  				System.out.print("Nome: " + funcionarios[i][1] + "\n\n");
  				System.out.print("Email: " + funcionarios[i][2] + "\n\n");
  				System.out.print("CPF: " + funcionarios[i][3] + "\n\n");
  				System.out.print("Salario: " + funcionarios[i][4] + "\n\n");
  				System.out.print("Telefone: " + funcionarios[i][5] + "\n\n");
  			}
  		}
  		for(i=0;i<linha_funcionarios;i++){
  			if(funcionarios[i][0].equals("7")){
  				System.out.println(i);
  				System.out.print("Cargo: Advogado\n\n");
  				System.out.print("Nome: " + funcionarios[i][1] + "\n\n");
  				System.out.print("Email: " + funcionarios[i][2] + "\n\n");
  				System.out.print("CPF: " + funcionarios[i][3] + "\n\n");
  				System.out.print("Salario: " + funcionarios[i][4] + "\n\n");
  				System.out.print("Telefone: " + funcionarios[i][5] + "\n\n");
  			}
  		}
  	}
  	if(opt.equals("9")){
  		System.exit(0);
  	}
  	menu();
  }
  public static void socios(){
  	String opt = "";
  	Scanner sc = new Scanner(System.in);
  	System.out.print("Escolha uma opcao:\n\n");
  	System.out.print("1-Adicionar Socio\n\n");
  	System.out.print("2-Alterar Adimplencia\n\n");
  	System.out.print("3-Alterar Plano\n\n");
  	System.out.print("9-Sair\n\n");
  	opt = sc.nextLine();
  	while((!(opt.equals("1")))&&(!(opt.equals("2")))&&(!(opt.equals("9")))&&(!(opt.equals("3")))){
  		clear();
  		socios();
  	}
  	if(opt.equals("1")){
  		System.out.print("Digite o nome:\n\n");
  		socios[linha_socios][0] = sc.nextLine();
  		System.out.print("Digite o email:\n\n");
  		socios[linha_socios][1] = sc.nextLine();
  		System.out.print("Digite o CPF:\n\n");
  		socios[linha_socios][2] = sc.nextLine();
  		System.out.print("Digite o telefone:\n\n");
  		socios[linha_socios][3] = sc.nextLine();
  		System.out.print("Digite o endereco:\n\n");
  		socios[linha_socios][4] = sc.nextLine();
  		System.out.print("Digite o plano:\n\n");
  		socios[linha_socios][5] = sc.nextLine();
  		System.out.print("Esta Adimplente ou Inadimplente:\n\n");
  		socios[linha_socios][6] = sc.nextLine();
  		isoccer.linha_socios++;
  		clear();
  		System.out.print("Adicionado com Sucesso\n\n");
  	}
  	if((opt.equals("2")) && linha_socios>0){
  		int p=0;
  		String opt2="", estado="";
  		System.out.print("Qual dos Seguintes socios voce deseja alterar:\n\n");
  		for(p=0;p<linha_socios;p++){
  			System.out.print(p + " " + socios[p][0] + "\n\n");
  		}
  		opt2 = sc.nextLine();
  		System.out.print("Adimplente ou Inadimplente:\n\n");
  		socios[linha_socios][6] = sc.nextLine();
  		System.out.print("Alterado com Sucesso\n\n");
  	}
  	else if(opt.equals("2")){
  		System.out.print("Nao existem socios\n\n");
  	}
  	if((opt.equals("3")) && linha_socios>0){
  		int p=0;
  		String opt2="", estado="";
  		System.out.print("Qual dos Seguintes socios voce deseja alterar:\n\n");
  		for(p=0;p<linha_socios;p++){
  			System.out.print(p + " " + socios[p][0] + " - " + socios[p][6] + "\n\n");
  		}
  		opt2 = sc.nextLine();
  		System.out.print("Digite o novo plano:\n\n");
  		socios[linha_socios][5] = sc.nextLine();
  		System.out.print("Alterado com Sucesso\n\n");
  	}
  	else if(opt.equals("3")){
  		System.out.print("Nao existem socios\n\n");
  	}
  	if(opt.equals("9")){
  		System.exit(0);
  	}
  	menu();
  }
  public static void clear(){
  	int i=0;
  	for(i=0;i<75;i++) System.out.print("\n\n");
  }
	public static void relatorio_socios()
	{
		String opt = "";
  	Scanner sc = new Scanner(System.in);
  	System.out.print("Escolha uma opcao:\n\n");
  	System.out.print("1-Quantidade\n\n");
  	System.out.print("2-Adimplentes\n\n");
  	System.out.print("3-Inadimplentes\n\n");
  	System.out.print("4-Dados individuais\n\n");
  	System.out.print("9-Sair\n\n");
  	opt = sc.nextLine();
  	while((!(opt.equals("1")))&&(!(opt.equals("2")))&&(!(opt.equals("3")))&&(!(opt.equals("9")))&&(!(opt.equals("4")))){
  		clear();
  		relatorio_socios();
  	}
  	if(opt.equals("1")){
  		clear();
  		System.out.print(linha_socios + " socios\n\n");
  	}
  	if(opt.equals("2")){
  		clear();
  		int b=0;
  		System.out.print("Socios Adimplentes:\n\n");
  		for(b=0;b<linha_socios;b++){
  			if("Adimplente".equalsIgnoreCase(socios[b][6])){
	  				System.out.print("Nome: " + socios[b][0] + "\n\n");
	  			}
  		}
  	}
  	if(opt.equals("3")){
  		clear();
  		int b=0;
  		System.out.print("Socios Inadimplentes:\n\n");
  		for(b=0;b<linha_socios;b++){
  			if("Inadimplente".equalsIgnoreCase(socios[b][6])){
	  				System.out.print("Nome: " + socios[b][0] + "\n\n");
	  			}
  		}
  	}
  	if(opt.equals("4")){
  		int b=0;
  		clear();
  		System.out.print("Socios:\n\n");
  		for(b=0;b<linha_socios;b++){
  			System.out.print("Nome: " + socios[b][0] + "\n\n");
  			System.out.print("Email: " + socios[b][1] + "\n\n");
  			System.out.print("CPF: " + socios[b][2] + "\n\n");
  			System.out.print("Telefone: " + socios[b][3] + "\n\n");
  			System.out.print("Endereco: " + socios[b][4] + "\n\n");
  			System.out.print("Plano: " + socios[b][5] + "\n\n");
  			System.out.print("Adimplencia: " + socios[b][6] + "\n\n");
  			System.out.print("\n\n");
  		}
  	}
  		if(opt.equals("9")){
  		System.exit(0);
  		}
  		menu();
	}
	public static void recursos(){
		String opt = "";
  	Scanner sc = new Scanner(System.in);
  	System.out.print("Escolha uma opcao:\n\n");
  	System.out.print("1-Onibus\n\n");
  	System.out.print("2-Estadio\n\n");
  	System.out.print("3-Centro de Treinamento\n\n");
  	System.out.print("9-Sair\n\n");
  	opt = sc.nextLine();
	  	while((!(opt.equals("1")))&&(!(opt.equals("2")))&&(!(opt.equals("3")))&&(!(opt.equals("9")))){
	  		clear();
	  		recursos();
	  	}
	  	if(opt.equals("1")){
	  		clear();
	  		onibus();
	  	}
	  	if(opt.equals("2")){
	  		clear();
	  		estadio();
	  	}
	  	if(opt.equals("3")){
	  		clear();
	  		centro_treinamento();
	  	}
	  	if(opt.equals("9")){
	  		System.exit(0);
	  	}
	}
	public static void onibus()
	{
		String opt = "";
	  	Scanner sc = new Scanner(System.in);
	  	System.out.print("Escolha uma opcao:\n\n");
	  	System.out.print("1-Adquirir um onibus\n\n");
	  	if(recursos[0][0]>0){
	  		System.out.print(recursos[0][0] + " onibus disponiveis\n\n");
	  	}else{
	  		System.out.print("Nenhum onibus disponivel\n\n");
	  	}
	  	System.out.print("2-Retornar ao menu\n\n");
	  	System.out.print("9-Sair\n\n");
	  	opt = sc.nextLine();
	  	while((!(opt.equals("1")))&&(!(opt.equals("2")))&&(!(opt.equals("9")))){
	  		clear();
	  		onibus();
	  	}
	  	if(opt.equals("1")){
	  		isoccer.recursos[0][0]++;
	  		System.out.print("Onibus adicionado\n\n");
	  	}
	  	if(opt.equals("2")){
	  		clear();
	  		menu();
	  	}
	  	if(opt.equals("9")){
	  		System.exit(0);
	  	}
	  	menu();
	}
	public static void estadio(){
		String opt = "";
	  	Scanner sc = new Scanner(System.in);
	  	System.out.print("Escolha uma opcao:\n\n");
	  	System.out.print("1-Adquirir um estadio\n\n");
	  	if(recursos[1][0]>0){
	  		System.out.print("Estadio disponivel\n\n");
	  		System.out.print("Capacidade: " + recursos[1][1] + "\n\n");
	  		System.out.print("Numero de banheiros: " + recursos[1][2] + "\n\n");
	  		System.out.print("Numero de lanchonetes: " + recursos[1][3] + "\n\n");
	  	}
	  	else{
	  		System.out.print("Estadio indisponivel\n\n");
	  	}
	  	System.out.print("2-Modificar o estadio\n\n");
	  	System.out.print("3-Retornar para o menu\n\n");
	  	System.out.print("9-Sair\n\n");
	  	opt = sc.nextLine();
	  	while((!(opt.equals("1")))&&(!(opt.equals("2")))&&(!(opt.equals("9")))&&(!(opt.equals("3")))){
	  		clear();
	  		onibus();
	  	}
	  	if(opt.equals("1") && recursos[1][0]==0){
	  		isoccer.recursos[1][0]++;
	  		System.out.print("Digite a capacidade:\n\n");
	  		recursos[1][1] = sc.nextInt();
	  		System.out.print("Digite o numero de banheiros:\n\n");
	  		recursos[1][2] = sc.nextInt();
	  		System.out.print("Digite o numero de lanchonetes:\n\n");
	  		recursos[1][3] = sc.nextInt();
	  		System.out.print("Estadio adquirido\n\n");
	  	}else{
	  		System.out.print("Voce ja possui um estadio\n\n");
	  	}
	  	if(opt.equals("2") && recursos[1][0]==1){
	  			String opt2 = "";
			  	System.out.print("Escolha uma opcao:\n\n");
			  	System.out.print("1-Alterar a capacidade\n\n");
			  	System.out.print("2-Alterar o numero de banheiros\n\n");
			  	System.out.print("3-Alterar o numero de lanchonetes\n\n");
			  	System.out.print("9-Sair\n\n");
			  	opt2 = sc.nextLine();
			  	clear();
			  	while((!(opt2.equals("1")))&&(!(opt2.equals("2")))&&(!(opt2.equals("3")))&&(!(opt2.equals("9")))){
			  		menu();
			  	}
			  	if(opt2.equals("1")){
			  		System.out.print("Digite a capacidade:\n\n");
	  				recursos[1][1] = sc.nextInt();
			  	}
			  	if(opt2.equals("2")){
			  		System.out.print("Digite o numero de banheiros:\n\n");
	  				recursos[1][2] = sc.nextInt();
			  	}
			  	if(opt2.equals("3")){
			  		System.out.print("Digite o numero de lanchonetes:\n\n");
	  				recursos[1][3] = sc.nextInt();
			  	}
			  	if(opt2.equals("9")){
	  			System.exit(0);
	  			}
	  	}
	  	else{
	  		System.out.print("Voce nao possui um estadio\n\n");
	  	}
	  	if(opt.equals("3")){
	  		clear();
	  		menu();
	  	}
	  	if(opt.equals("9")){
	  		System.exit(0);
	  	}
	  	menu();
	}
	public static void centro_treinamento(){
		String opt = "";
	  	Scanner sc = new Scanner(System.in);
	  	System.out.print("Escolha uma opcao:\n\n");
	  	System.out.print("1-Adquirir um CT\n\n");
	  	if(recursos[1][0]>0){
	  		System.out.print("CT disponivel\n\n");
	  		System.out.print(recursos[2][1] + " dormitorios\n\n");
	  	}
	  	else{
	  		System.out.print("CT indisponivel\n\n");
	  	}
	  	System.out.print("2-Modificar CT\n\n");
	  	System.out.print("3-Retornar ao menu\n\n");
	  	System.out.print("9-Sair\n\n");
	  	opt = sc.nextLine();
	  	while((!(opt.equals("1")))&&(!(opt.equals("2")))&&(!(opt.equals("9")))&&(!(opt.equals("3")))){
	  		clear();
	  		onibus();
	  	}
	  	if(opt.equals("1") && recursos[2][0]==0){
	  		isoccer.recursos[2][0]++;
	  		System.out.print("Digite o numero de dormitorios:\n\n");
	  		recursos[2][1] = sc.nextInt();
	  		System.out.print("CT adquirido\n\n");
	  	}else{
	  		System.out.print("Voce ja possui um CT\n\n");
	  	}
	  	if(opt.equals("2")){
	  		System.out.print("Digite o novo numero de dormitorios:\n\n");
	  		recursos[2][1] = sc.nextInt();
	  	}
	  	else{
	  		System.out.print("Voce nao possui um CT\n\n");
	  	}
	  	if(opt.equals("3")){
	  		clear();
	  		menu();
	  	}
	  	if(opt.equals("9")){
	  		System.exit(0);
	  	}
	  	menu();
	}
	public static void relatorio_recursos(){
		if(recursos[0][0]>0){
			System.out.print(recursos[0][0] + " onibus disponiveis\n\n");
		}
		else{
			System.out.print("Nenhum onibus disponivel\n\n");
		}
		if(recursos[1][0]>0){
			System.out.print("Estadio disponivel\n\n");
			System.out.print("Capacidade: " + recursos[1][1] + "\n\n");
			System.out.print("Numero de banheiros: " + recursos[1][2] + "\n\n");
			System.out.print("Numero de lanchonetes: " + recursos[1][3] + "\n\n");
		}
		else{
			System.out.print("Nao possui estadio\n\n");
		}
		if(recursos[2][0]>0){
			System.out.print("CT disponivel\n\n");
			System.out.print("Dormitorios: " + recursos[2][1] + "\n\n");
		}
		else{
			System.out.print("Nao possui CT\n\n");
		}
		menu();
	}
	public static void relatorio_geral(){
		int i =0;
		for(i=0;i<linha_funcionarios;i++){
  			if(funcionarios[i][0].equals("1")){
  				System.out.println(i);
  				System.out.print("Cargo: Presidente\n\n");
  				System.out.print("Nome: " + funcionarios[i][1] + "\n\n");
  			}
  		}
  		for(i=0;i<linha_funcionarios;i++){
  			if(funcionarios[i][0].equals("2")){
  				System.out.println(i);
  				System.out.print("Cargo: Medico\n\n");
  				System.out.print("Nome: " + funcionarios[i][1] + "\n\n");
  			}
  		}
  		for(i=0;i<linha_funcionarios;i++){
  			if(funcionarios[i][0].equals("3")){
  				System.out.println(i);
  				System.out.print("Cargo: Treinador\n\n");
  				System.out.print("Nome: " + funcionarios[i][1] + "\n\n");
  			}
  		}
  		for(i=0;i<linha_funcionarios;i++){
  			if(funcionarios[i][0].equals("4")){
  				System.out.println(i);
  				System.out.print("Cargo: Preparador Fisico\n\n");
  				System.out.print("Nome: " + funcionarios[i][1] + "\n\n");
  			}
  		}
  		for(i=0;i<linha_funcionarios;i++){
  			if(funcionarios[i][0].equals("5")){
  				System.out.println(i);
  				System.out.print("Cargo: Motorista\n\n");
  				System.out.print("Nome: " + funcionarios[i][1] + "\n\n");
  			}
  		}
  		for(i=0;i<linha_funcionarios;i++){
  			if(funcionarios[i][0].equals("6")){
  				System.out.println(i);
  				System.out.print("Cargo: Cozinheiro\n\n");
  				System.out.print("Nome: " + funcionarios[i][1] + "\n\n");
  			}
  		}
  		for(i=0;i<linha_funcionarios;i++){
  			if(funcionarios[i][0].equals("7")){
  				System.out.println(i);
  				System.out.print("Cargo: Advogado\n\n");
  				System.out.print("Nome: " + funcionarios[i][1] + "\n\n");
  			}
  		}
  		for(i=0;i<linha_funcionarios;i++){
  			if(funcionarios[i][0].equals("8")){
  				System.out.println(i);
  				System.out.print("Cargo: Jogador\n\n");
  				System.out.print("Nome: " + funcionarios[i][1] + "\n\n");
  			}
  		}
  		int b=0;
  		System.out.print("Quantidade de socios: " + linha_socios + "\n\n");
  		System.out.print("Socios Adimplentes:\n\n");
  		for(b=0;b<linha_socios;b++){
  			if("Adimplente".equalsIgnoreCase(socios[b][6])){
	  				System.out.print("Nome: " + socios[b][0] + "\n\n");
	  			}
  		}
  		System.out.print("Socios Inadimplentes:\n\n");
  		for(b=0;b<linha_socios;b++){
  			if("Inadimplente".equalsIgnoreCase(socios[b][6])){
	  				System.out.print("Nome: " + socios[b][0] + "\n\n");
	  			}
  		}
  		relatorio_recursos();
		menu();
	}
	
}