package project;

import java.util.ArrayList;

class SyncronizationSystem {
    
    private ArrayList<Machine> listamaquinas = new ArrayList(); // lista de maquinas a sincronizar
    private ISyncAlgorithm sa; // Algoritmo de sincronizacion
    
    public void SyncronizationSystem(){}
    
    public void setSyncSysetem(ISyncAlgorithm sa)
    {
        this.sa = sa;
    }
    
    public void addMachine(Machine m)
    {
        listamaquinas.add(m);
    }
    
    public void Syncronized()
    {
         sa.Syncronized(listamaquinas);
    }
}
