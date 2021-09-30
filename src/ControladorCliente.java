import  java.util.ArrayList;

public class ControladorCliente {
    private ArrayList <Cliente> estList; 

    VistaCliente vista;

    ControladorCliente(VistaCliente vista){
        estList = new ArrayList<Cliente>();
        this.vista = vista;
    }

    public void agregarCliente(){ //Agregar cliente (NO OLVIDAR EL TRUCO).
        estList.add(0, new Cliente(vista.ingresarNombre(), vista.ingresarApellido(), vista.ingresarNumeroC(), vista.ingresarSaldo()));
    }

    public Cliente buscarCliente(Integer NumeroCuenta){
        for (int i=0; i<estList.size(); i++){
            if (NumeroCuenta==estList.get(i).getnumerocuenta()){
                return estList.get(i);
            }

        }
        return null;
    }
    public void Deposito(Double Cantidad, Cliente cliente){
        Double Nuevos;
        Nuevos = cliente.getsaldo() + Cantidad;
        cliente.setsaldo(Nuevos);
    }
    public Integer Retiro (Cliente cliente){
        Double CuRetiro, Nuevos;

        CuRetiro= vista.realizarRetiro();
        if (cliente.getsaldo()< Retiro){
            return 0;
        }
        else {
            Nuevos=Cliente.getsaldo()- CuRetiro;
            cliente.setsaldo(Nuevos);
            return 1;

        }

    }


}

