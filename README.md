# fondoEntornos
//TODO EL ARCHIVO EN LA CLASE LISTA
//Termina parte de angel (constructor y demás)
    public void atenderCliente(Cliente nuevo) {
        for (int i = 0; i < listaClientes.length; i++) {
            if (listaClientes[i] == nuevo) {
                atendido = true;
                i = listaClientes.length + 1;
            }
        }
    }

    public void abandonarLista(Cliente eliminado) {
        for (int i = 0; i < listaClientes.length; i++) {
            if (eliminado.getNumLista() > listaClientes[i].getNumLista()) {
                listaClientes[i].setNumLista(-1);
            }
        }
        for (int i = 0; i < listaClientes.length; i++) {
            if (listaClientes[i] == eliminado) {
                listaClientes[i] = null;
            }
        }

    }
//Termina parte de Manu


    public void adelantarPuesto(Cliente adelantado) {
        for (int i = 0; i < listaClientes.length; i++) {
            if (adelantado.getNumLista() > listaClientes[i].getNumLista()) {
                listaClientes[i].setNumLista(-1);
                i = listaClientes.length;
                adelantado.setNumLista(+1);
            }
        }
    }

    public void atrasarPuesto(Cliente atrasado) {
        for (int i = 0; i < listaClientes.length; i++) {
            if (atrasado.getNumLista() > listaClientes[i].getNumLista()) {
                listaClientes[i].setNumLista(+1);
                i = listaClientes.length;
                atrasado.setNumLista(-1);
            }
        }
    }

//Termina parte de Kiko

    public void dejarPasar(Cliente pasado) {
        for (int i = 0; i < listaClientes.length; i++) {
            if (pasado.getNumLista() > listaClientes[i].getNumLista()) {
                listaClientes[i].setNumLista(-1);
                i = listaClientes.length;
                pasado.setNumLista(+1);
            }
        }
    }

    public void mostrarAtendidos() {
        for (int i = 0; i < listaClientes.length; i++) {
            if (atendido) {
                System.out.println(listaClientes[i].getNombre());
            }
        }

    }



    public void mostrarNoAtendidos() {
        for (int i = 0; i < listaClientes.length; i++) {
            if (!atendido) {
                System.out.println(listaClientes[i].getNombre());
            }
        }
    }
//Termina parte de Elena