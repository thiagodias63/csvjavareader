/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jaquelinecsv;

import java.io.*;
import java.util.Arrays;
import jaquelinecsv.Funcionario;
import java.util.ArrayList;
/**
 *
 * @author thiago.dias
 */
public class JaquelineCsv {
    private static final String SEPARADOR = ";";
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws Exception {
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        ArrayList<Integer> funcionario_nao_encontrado = new ArrayList<Integer>();
        ArrayList<Integer> funcionario_com_dados_diferentes = new ArrayList<Integer>();
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(
        new FileInputStream("C:\\Users\\thiago.dias.STC\\Documents\\NetBeansProjects\\JaquelineCsv\\src\\arquivos\\ativos.csv"))
        );
        String linha = null;
        while ((linha = reader.readLine()) != null) {
            String[] dadosUsuario = linha.split(SEPARADOR);
            
            Funcionario fucionario_auxiliar = new Funcionario(Integer.parseInt(dadosUsuario[0]),
                                                                dadosUsuario[1].toLowerCase(),
                                                                dadosUsuario[2].toLowerCase(),
                                                                dadosUsuario[3].toLowerCase(),
                                                                Float.parseFloat(dadosUsuario[4]
                                                                        .replace(".", "")
                                                                        .replace(",", ".")));
            funcionarios.add(fucionario_auxiliar);
        }
        reader.close();
        
        reader = new BufferedReader(new InputStreamReader(
        new FileInputStream("C:\\Users\\thiago.dias.STC\\Documents\\NetBeansProjects\\JaquelineCsv\\src\\arquivos\\rubi.csv"))
        );
        linha = null;
        int i = 0;
        while ((linha = reader.readLine()) != null) {
            String[] dadosUsuario = linha.split(SEPARADOR);
            Funcionario fucionario_auxiliar = new Funcionario(Integer.parseInt(dadosUsuario[0]),
                                                                dadosUsuario[1].toLowerCase(),
                                                                dadosUsuario[2].toLowerCase(),
                                                                dadosUsuario[3].toLowerCase(),
                                                                Float.parseFloat(dadosUsuario[4]
                                                                        .replace(".", "")
                                                                        .replace(",", ".")));
            if(!funcionarios.contains(fucionario_auxiliar) )
            {
                i++;
                System.out.println(fucionario_auxiliar.getCodigo() + ",");
            }
        }
        reader.close();
        /*
        for(Funcionario fun : funcionarios)
        {
            System.out.println(fun.getNome() + " | " + fun.getCargo());
        }
        */
    }
}
