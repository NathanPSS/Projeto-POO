

import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        Scanner scInt= new Scanner(System.in);
        Scanner scString= new Scanner(System.in);
        Scanner scDouble=new Scanner(System.in);
        int confere=0;
        ArrayList<Funcionario> Funcionarios= new ArrayList<>();
        ArrayList<Produto> Maquiagens=new ArrayList<>();
        ArrayList<Cliente> Clientes=new ArrayList<>();
        ArrayList<Produto> ProdutosCabelo=new ArrayList<>();
        ArrayList<Produto> Perfumes=new ArrayList<>();
        ArrayList<Produto> ProdutosCorpo=new ArrayList<>();
        ArrayList<Pedido>  Pedidos=new ArrayList<>();
        System.out.println("Bem vindo ao Sistema aperte");
        int escolhe;
        do{
            System.out.println("1 para cadastramento de funcionarios");
            System.out.println("2 para cadastramento de produtos");
            System.out.println("3 para cadastramento dos clientes");
            System.out.println("4 para fazer pedidos");
            System.out.println("5 para sair");
            escolhe=scInt.nextInt();
            switch(escolhe){
                case 1:
                    do{
                        System.out.println("Para cadastrar os funcionarios coloque em ordem");
                        System.out.println("O nome");
                        System.out.println("O CPF");
                        System.out.println("O cargo");
                        System.out.println("O endereco");
                        System.out.println("E o telefone");
                        Funcionarios.add(new Funcionario(scString.nextLine(),scString.nextLine(),scString.nextLine(),scString.nextLine(),scString.nextLine()));
                        System.out.println("Digite 1 para sair ou 0 para continuar");
                        confere=scInt.nextInt();
                    }while(confere!=1);
                    break;
                case 2:
                    do{
                        System.out.println("Escolha o tipo de produto para cadastrar");
                        System.out.println("1 para Perfumes");
                        System.out.println("2 para Maquiagem");
                        System.out.println("3 para Cabelo");
                        System.out.println("4 para Corpo");
                        System.out.println("5 para sair");
                        escolhe=scInt.nextInt();
                        if(escolhe==5){
                            break;
                        }
                        switch(escolhe){
                            case 1:
                                do{
                                    System.out.println("Para cadastrar perfumes coloque em ordem");
                                    System.out.println("O valor");
                                    System.out.println("A linha");
                                    System.out.println("A familia aromatica");
                                    System.out.println("a descricao");
                                    Perfumes.add(new Perfume(scDouble.nextDouble(),scString.nextLine(),scString.nextLine(),scString.nextLine()));
                                    System.out.println("Digite 1 para sair 0 para continuar");
                                    confere=scInt.nextInt();
                                }while(confere!=1);
                                break;
                            case 2:
                                do{
                                    System.out.println("Para cadastrar maquiagem coloque em ordem");
                                    System.out.println("O valor");
                                    System.out.println("A linha");
                                    System.out.println("A cor");
                                    System.out.println("E o tipo de maquigem");
                                    Maquiagens.add(new Maquiagem(scDouble.nextDouble(),scString.nextLine(),scString.nextLine(),scString.nextLine()));
                                    System.out.println("Digite 1 para sair 0 para continuar");
                                    confere=scInt.nextInt();
                                }while(confere!=1);
                                break;
                            case 3:
                                do{
                                    System.out.println("Para cadastrar produtos do cabelo coloque em ordem");
                                    System.out.println("o valor");
                                    System.out.println("a linha");
                                    System.out.println("o tipo");
                                    ProdutosCabelo.add(new ProdutoCabelo(scDouble.nextDouble(), scString.nextLine(),scString.nextLine()));
                                    System.out.println("Digite 1 para sair 0 para continuar");
                                    confere=scInt.nextInt();
                                }while(confere!=1);
                                break;
                            case 4:
                                do{
                                    System.out.println("Para cadastrar os produtos relativos ao corpo coloque em ordem");
                                    System.out.println("O valor");
                                    System.out.println("A linha");
                                    System.out.println("O tipo");
                                    System.out.println("A fragancia");
                                    ProdutosCorpo.add(new ProdutoCorporal(scDouble.nextDouble(),scString.nextLine(),scString.nextLine(),scString.nextLine()));
                                    System.out.println("Digite 1 para sair 0 para continuar");
                                    confere=scInt.nextInt();
                                }while(confere!=1);
                                break;
                        }
                    }while(escolhe!=5);
                    break;
                case 3:
                    do{
                        System.out.println("Para cadastrar os cliente digite em ordem");
                        System.out.println("O nome");
                        System.out.println("CPF");
                        System.out.println("Telefone");
                        Clientes.add(new Cliente(scString.nextLine(),scString.nextLine(),scString.nextLine()));
                        System.out.println("Digite 1 para sair ou 0 para continuar");
                        confere=scInt.nextInt();
                    }while(confere!=1);
                    break;
                case 4:
                    do{
                        System.out.println("Para realizar o pedido coloque");
                        System.out.println("o CPF");
                        System.out.println("O codigo(s) dos produto(s) e a quantidade seguindo o seguinte modelo codigo-quantidade");
                        Pedidos.add(new Pedido(scString.nextLine(),scString.nextLine()));
                        System.out.println("Digite 1 para sair ou 0 para continuar");
                        confere=scInt.nextInt();
                    }while(confere!=1);
            }
            System.out.println("Deseja encerrar o cadastro 5 para encerrar 0 para continuar");
            escolhe=scInt.nextInt();
        }while(escolhe!=5);
    }
}

