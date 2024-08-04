package app.service;

import entity.Editora;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EditoraService {

    public String save (Editora editora) {
        return "Editora cadastrado com sucesso";
    }

    public String update (Editora editora, long id) {
        return "Atualizado com sucesso";
    }

    public Editora findById (long id) {

        List<Editora> listaTemp = this.findAll();

        for (int i = 0; i < listaTemp.size(); i++) {
            if(listaTemp.get(i).getId() == id) {
                return listaTemp.get(i);
            }
        }

        return null;

    }

    public List<Editora> findAll () {

        List<Editora> lista = new ArrayList<>();
        lista.add(new Editora(1,"Panini 1", "Foz do Iguacu"));
        lista.add(new Editora(2,"Panini 2", "Foz do Iguacu"));
        lista.add(new Editora(3,"Panini 3", "Foz do Iguacu"));
        lista.add(new Editora(4,"Panini 4", "Foz do Iguacu"));

        return lista;
    }

    public String delete (long id) {

        List<Editora> listaTemp = this.findAll();

        for (int i = 0; i < listaTemp.size(); i++) {
            if(listaTemp.get(i).getId() == id) {
                return listaTemp.get(i).getNome()+" deletado com sucesso";
            }
        }
        return "Editora não encontrado";
    }
}
