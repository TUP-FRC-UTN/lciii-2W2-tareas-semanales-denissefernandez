package municipalidad;

public class Municipalidad {

    private Plan[] plan;

    public Municipalidad(int cant) {
        this.plan = new Plan[cant];
    }

    public void agregarPlan(Plan p) {
        for (int i = 0; i < plan.length; i++) {
            if (plan[i] == null) {
                plan[i] = p;
                break;
            }

        }
    }

    public int cantidadPlanesPagados() {
        int totalPagados = 0;

        for (int i = 0; i < plan.length; i++) {
            //comparo q el plan no tenga nulos
            //y que la cant d cuotas del plan sea igual a la cant de pagos recibidos
            if (plan[i] != null && plan[i].pagosCompletos() == plan[i].getCuotas()) {
                totalPagados++;
            }
        }
        return totalPagados;
    }

//    public int cantidadPlanesPagados() {
//        int total=0;
//        
//        for (int i = 0; i < plan.length; i++) {
//            if(plan[i]!=null){
//            if(plan[i].estaPagadoTotalente())
//                total++;
//            }
//            
//        }
//        return total;
//        
//    }
    public float sumatoriaDeudas() {
        float totalDeudas = 0;

        for (int i = 0; i < plan.length; i++) {
            if (plan[i] != null) {
                totalDeudas += plan[i].getDeuda();
            }
        }
        return totalDeudas;
    }

    public String listadoPagosContribuyente(String nombre) {
        String list = "";

        for (int i = 0; i < plan.length; i++) {
            if (plan[i] != null && plan[i].getNombre().equalsIgnoreCase(nombre)) {
                list += plan[i].listadoPagos() + "\n";
            }
        }
        return list;
    }

    public float promedioIntereses() {
        float promedio = 0;
        float intereses = 0;
        int cantidad = 0;

        for (int i = 0; i < plan.length; i++) {
            if (plan[i] != null) {
                intereses += plan[i].sumaInteresesCobrados();
                cantidad++;
            }
            promedio = intereses / cantidad;

        }
        return promedio;
    }

}
