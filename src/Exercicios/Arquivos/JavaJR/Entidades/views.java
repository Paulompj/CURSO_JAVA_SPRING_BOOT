package Exercicios.Arquivos.JavaJR.Entidades;
import Exercicios.Arquivos.JavaJR.Exception.EmailException;
import Exercicios.Arquivos.JavaJR.Exception.IdadeException;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class views {
    static Scanner input = null;

    public static void cadastrarUsuario(int cont) {
        Usuario x = new Usuario(Perguntas.cadastronome(), Perguntas.cadastroemail(), Perguntas.cadastroidade(), Perguntas.cadastroaltura());
        String o = "./Usuarios/" + cont + "-" + x.getNome() + ".txt";
        String caminho = o.replaceAll(" ", "");
        TXT.Escrever(caminho, x);
    }
    public static void verificarEmail(String email) throws Exception {
        ArrayList<Usuario> usuarios = views.pegarUsuariosDoTXT();
        input = new Scanner(System.in);
        for (int i = 0; i < usuarios.size(); i += 1) {
            if (usuarios.get(i).getEmail().equals(email)) {
                throw new EmailException("Email ja cadastrado");
            }
        }
    }
    public static void verificarArroba(String email) throws EmailException {
        if(email.indexOf('@') == -1){
            throw new EmailException("Formado de email INVÁLIDO!\nÉ obrigatório usar o '@'");
        }

    }
    public static void verificarIdade(int idade) throws IdadeException {
        if(idade < 18){
            throw new IdadeException("Erro! É preciso ter mais de 18 anos para se cadastrar no sistema");
        }
    }
    public static void listarUsuarios() {
            if (autenticar()) {
                File caminho = new File("./Usuarios");
                File folder = caminho;

                // Verifica se o caminho é um diretório
                if (folder.isDirectory()) {
                    // Lista todos os arquivos no diretório
                    File[] listOfFiles = folder.listFiles();

                    // Itera sobre cada arquivo no diretório
                    if (listOfFiles != null) {
                        for (File file : listOfFiles) {
                            // Verifica se é um arquivo (não um diretório)
                            if (file.isFile()) {
                                // Imprime o nome do arquivo
                                System.out.println(file.getName().replaceAll(".txt", ""));
                            }
                        }
                    } else {
                        System.out.println("O diretório está vazio ou não pôde ser lido.");
                    }
                } else {
                    System.out.println("O caminho especificado não é um diretório.");
                }
            }
            else{
                System.out.println("\tNao existem usuarios cadastrados");
            }
        }

        public static void detalharUsuario () {
            if (autenticar()) {
                ArrayList<Usuario> usuarios = views.pegarUsuariosDoTXT();
                input = new Scanner(System.in);
                System.out.println("Deseja detalhar por:\n\t1-Nome\n\t2-Idade\n\t3-Email");
                System.out.print("Resposta: ");
                int escolha = input.nextInt();
                input.nextLine();
                switch (escolha) {
                    case 1:
                        File caminho = new File("./Usuarios");
                        File[] x = caminho.listFiles();
                        System.out.println("Digite o nome do usuário: ");
                        String nome = input.nextLine();
                        for (File i : x) {
                            if (i.getName().substring(2).startsWith(nome)) {
                                System.out.println(i.getName());
                                try {
                                    input = new Scanner(i);
                                    while (input.hasNextLine()) {
                                        System.out.println(input.nextLine());
                                    }
                                } catch (FileNotFoundException e) {
                                    throw new RuntimeException(e);
                                } finally {
                                    input.close();
                                }
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Digite a idade do usuario: ");
                        int idadeDig = input.nextInt();
                        input.nextLine();
                        for (int i = 0; i < usuarios.size(); i += 1) {
                            if (usuarios.get(i).getIdade() == idadeDig) {
                                System.out.println(usuarios.get(i));
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Digite o email do usuario: ");
                        String emaildig = input.nextLine();
                        for (int i = 0; i < usuarios.size(); i += 1) {
                            if (usuarios.get(i).getEmail().equals(emaildig)) {
                                System.out.println(usuarios.get(i));
                            }
                        }
                        break;
                    default:
                        System.out.println("Escolha inválida");
                        break;
                }
            }
            else{
                System.out.println("Nenhum usuário cadastrado");
            }
        }


        public static ArrayList<Usuario> pegarUsuariosDoTXT () {

                ArrayList<Usuario> usuarios = new ArrayList<>();
                File caminho = new File("./Usuarios");
                if (caminho.isDirectory()) {
                    // Lista todos os arquivos no diretório
                    File[] listOfFiles = caminho.listFiles();

                    // Itera sobre cada arquivo no diretório
                    if (listOfFiles != null) {
                        for (File file : listOfFiles) {
                            // Verifica se é um arquivo (não um diretório)
                            if (file.isFile()) {
                                // Imprime o nome do arquivo
                                try (BufferedReader leitor = new BufferedReader(new FileReader(file))) {
                                    String nome = leitor.readLine().substring(6);
                                    String email = leitor.readLine().substring(7);
                                    int idade = Integer.parseInt(leitor.readLine().substring(7));
                                    Double altura = Double.parseDouble(leitor.readLine().substring(8));
                                    Usuario x = new Usuario(nome, email, idade, altura);
                                    usuarios.add(x);
                                } catch (FileNotFoundException e) {
                                    throw new RuntimeException(e);
                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    }
                }
                return usuarios;
        }
        public static boolean autenticar() {
            File x = new File("./Usuarios");
            File[] n = x.listFiles();
            if (n.length == 0) {
                return false;
            } else {
                return true;
            }
        }
    }

