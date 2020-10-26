package br.example.listview;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ContatoAdapter extends BaseAdapter {
    private final List<Contato> contatos;
    private final Activity activity;
    public ContatoAdapter(List<Contato> contatos, Activity activity) {
        this.contatos = contatos;
        this.activity = activity;
    }
    @Override
    public int getCount() {
        return contatos.size();
    }
    @Override
    public Object getItem(int position) {
        return contatos.get(position);
    }
    @Override
    public long getItemId(int position) {
        return 0;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = activity.getLayoutInflater().

                inflate(R.layout.contato_layout, parent, false);

        Contato contato = contatos.get(position);
        TextView nome = (TextView) view.findViewById(R.id.nome_contato);
        TextView telefone = (TextView) view.findViewById(R.id.telefone_contato);
        ImageView foto = (ImageView) view.findViewById(R.id.imagem_contato);
        nome.setText(contato.getNome());
        telefone.setText(contato.getTelefone());
        foto.setImageResource(contato.getFotoId());
        return view;
    }
}
