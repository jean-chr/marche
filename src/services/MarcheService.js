import axios from 'axios'

const MARCHES_REST_API_URL = 'http://localhost:8080/marches';

class MarcheService {

    getMarches(){
        return axios.get(MARCHES_REST_API_URL);
    }
}

export default new MarcheService();
