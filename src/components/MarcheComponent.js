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
                <h1 className = "text-center"> Marches List</h1>
                <table className = "table table-striped">
                    <thead>
                        <tr>
                            <td> Id</td>
                            <td> Nom</td>
                            <td> Emplacement</td>
                            <td> Heure ouverture</td>
                            <td> Heure fermeture</td>
                            <td> Nbre hangars</td>
                        </tr>

                    </thead>
                    <tbody>
                        {
                            this.state.marches.map(
                                marche => 
                                <tr key = {marche.id}>
                                     <td> {marche.nom}</td>   
                                     <td> {marche.emplacement}</td>   
                                     <td> {marche.heure_ouverture}</td>   
                                     <td> {marche.heure_fermeture}</td> 
                                     <td> {marche.nbre_hangars}</td>   
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
