import React from 'react';
import MarcheService from '../services/MarcheService';

class MarcheComponent extends React.Component {

    constructor(props){
        super(props)
        this.state = {
            marches:[]
        }
    }

    componentDidMount(){
        MarcheService.getMarches().then((response) => {
            this.setState({ marches: response.data})
        });
    }


    render (){
        return (
            <div>
                <h1 className = "text-center"> Marches Liste</h1>
                <table className = "table table-striped">
                    <thead className="table-primary">
                        <tr>
                            <td> Id</td>
                            <td> Nom</td>
                            <td> Lieu</td>
                            <td> Heure ouverture</td>
                            <td> Heure fermeture</td>
                            <td> Nombre hangars</td>
                        </tr>

                    </thead>
                    <tbody>
                        {
                            this.state.marches.map(
                                marche => 
                                <tr key = {marche.id}>
                                     <td className = "table-warning"> {marche.id}</td>
                                     <td className = "table-warning"> {marche.nom}</td>   
                                     <td className = "table-warning"> {marche.lieu}</td>   
                                     <td className = "table-warning"> {marche.heure_ouverture}</td>   
                                     <td className = "table-warning"> {marche.heure_fermeture}</td> 
                                     <td className = "table-warning"> {marche.hangars_nombre}</td>   
                                </tr>
                            )
                        }

                    </tbody>
                </table>

            </div>

        )
    }
}

export default MarcheComponent
