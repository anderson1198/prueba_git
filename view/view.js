export default class View {
    constructor() {
        this.model = null;
        this.cards = document.getElementById('cards');
        this.templateCards = document.getElementById('template-card').content;
        this.fragment = document.createDocumentFragment();



    }

    setValue(product) {
        console.log(product);
    }

    addModel(model) {
        this.model = model;
    }

    render = async () => {
        const data = await this.model.viewData();

        // console.log(data);

        data.map(product => {

            this.card(product);
            // this.templateCards.querySelector('img').setAttribute('src', product.thumbnailUrl);
            // this.templateCards.querySelector('h5').textContent = product.title;
            // this.templateCards.querySelector('p').textContent = product.precio;
            // console.log(this.templateCards.getElementById('btn-Comprar'));
            // const clone = this.templateCards.cloneNode(true);
            // this.fragment.appendChild(clone);
            // console.log(product)

        })


        // console.log(this.fragment);
        this.cards.appendChild(this.fragment)


    }
    

    card(product) {

        
        this.templateCards.querySelector('a').setAttribute('href', `element/${product.id}`);
        this.templateCards.querySelector('img').setAttribute('src', product.thumbnailUrl);
        this.templateCards.querySelector('h5').textContent = product.title;
        this.templateCards.querySelector('p').textContent = product.precio;
        const clone = this.templateCards.cloneNode(true);
        this.fragment.appendChild(clone);


    //     this.fragment += ` 
    //     <div class="col-12 mb-2 col-md-2">
    //     <div class="card">
    //         <img src="${product.thumbnailUrl}" alt="" class="card-img-top">
    //         <div class="card-body">
    //             <h5>${product.title}</h5>
    //             <p>${product.precio}</p>
    //              <button class="btn btn-dark" id="btn-comprar">Comprar</button>
    //         </div>
    //     </div>
    // </div>`

        const btnBuy = document.createElement('button');
        btnBuy.classList.add('btn', "btn-dark");

        
    }


}