


export default class Models {

    constructor() {
        this.data = [];
    }

    loadData = async() => {

        const res = fetch('data.json');
        const data = (await res).json()
        this.data = await data;

        return data;

    }

    viewData = async() => {

        const data = await this.loadData();
        
        
        return [...this.data];

    }


}

