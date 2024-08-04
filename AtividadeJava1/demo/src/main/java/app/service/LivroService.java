package app.service;

import entity.Livro;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LivroService {

    public String save (Livro livro) {
        return "Livro cadastrado com sucesso";
    }

    public String update (Livro livro, long id) {
        return "Atualizado com sucesso";
    }

    public Livro findById (long id) {

        List<Livro> listaTemp = this.findAll();

        for (int i = 0; i < listaTemp.size(); i++) {
            if(listaTemp.get(i).getId() == id) {
                return listaTemp.get(i);
            }
        }

        return null;

    }

    public List<Livro> findAll () {

        List<Livro> lista = new ArrayList<>();
        lista.add(new Livro(1,"A volta dos que nao foram",2021, "Binotto"));
        lista.add(new Livro(2,"A volta dos que nao foram 1",2022, "Binotto"));
        lista.add(new Livro(3,"A volta dos que nao foram 2",2023, "Binotto"));
        lista.add(new Livro(4,"A volta dos que nao foram 3",2024, "Binotto"));

        return lista;
    }

    public String delete (long id) {

        List<Livro> listaTemp = this.findAll();

        for (int i = 0; i < listaTemp.size(); i++) {
            if(listaTemp.get(i).getId() == id) {
                return listaTemp.get(i).getTitulo()+" deletado com sucesso";
            }
        }
        return "Livro não encontrado";
    }
}
