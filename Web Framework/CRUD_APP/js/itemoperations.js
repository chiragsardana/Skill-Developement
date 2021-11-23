const itemOperations = {
    items:[],
    add(itemObject){
        this.items.push(itemObject);
    },
    remove(){
         this.items = this.items.filter(itemObject=>!itemObject.isMarked);   
        return this.items;
        },
    search(id){
            return this.items.find(itemObject=>itemObject.id ==id);
    },
    markUnMark(id){
            this.search(id).isMarked = !this.search(id).isMarked;
    },
    countTotalMark(){
           return this.items.filter(itemObject=>itemObject.isMarked).length; 
    },
    update(){

    }
}
