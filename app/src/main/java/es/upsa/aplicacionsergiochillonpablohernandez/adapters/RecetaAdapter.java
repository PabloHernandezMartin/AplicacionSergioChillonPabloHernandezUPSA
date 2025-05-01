package es.upsa.aplicacionsergiochillonpablohernandez.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import es.upsa.aplicacionsergiochillonpablohernandez.databinding.ItemsBinding;
import es.upsa.aplicacionsergiochillonpablohernandez.models.Receta;


public class RecetaAdapter extends RecyclerView.Adapter< RecetaAdapter.RecetaHolder >
{

    public static interface OnItemClickListener
    {
        public void onClick(Receta receta);
    }

    private List<Receta> recetas = List.of();
    private OnItemClickListener onItemClickListener;

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public void setRecetas(List<Receta> recetas)
    {
        this.recetas = recetas;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount()
    {

        return recetas.size();
    }

    @NonNull
    @Override
    public RecetaHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ItemsBinding viewBinding = ItemsBinding.inflate(layoutInflater, parent, false);
        return new RecetaHolder(viewBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull RecetaHolder holder, int position)
    {
        Receta receta = recetas.get(position);
        holder.bind(receta);
    }

    public class RecetaHolder extends RecyclerView.ViewHolder
    {
        private ItemsBinding viewBinding;

        public RecetaHolder(@NonNull ItemsBinding viewBinding)
        {
            super( viewBinding.getRoot() );
            this.viewBinding = viewBinding;
        }

        public void bind(Receta recetas)
        {
            viewBinding.getRoot().setOnClickListener( v -> onItemClickListener.onClick(recetas)   );
            viewBinding.detalleNombre.setText(recetas.getNombre());
            viewBinding.detalleDificultad.setText(recetas.getDificultad());
        }
    }


}
