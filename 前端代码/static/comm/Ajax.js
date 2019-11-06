/**
 * 简单封装了ajax对象
 */
class Ajax {
    
    vueObj = null;

    baseUrl = "http://localhost:8099/";

    /**
     * 构造方法
     * @param {*} vueObj 
     */
    constructor(vueObj) {

        this.vueObj = vueObj;
    }

    /**
     * get方法
     * @param {*} api 
     * @param {*} callback 
     * @param {*} params 
     */
    get(api,callback,params){
        let url = this.baseUrl + api ;
        let data = JSON.stringify(params);
        this.vueObj.$http.get(url, data,{emulateJSON:true})
        .then( res => {
            callback(JSON.parse(res.body));
        });
    }

    /**
     * post方法
     * @param {*} api 
     * @param {*} callback 
     * @param {*} params 
     */
    post(api,callback,params){
        let url = this.baseUrl + api ;
        let data = JSON.stringify(params);
        this.vueObj.$http.post(url, data,{emulateJSON:true})
        .then( res => {
            callback(JSON.parse(res.body));
        });
    }

    /**
     * put方法
     * @param {*} api 
     * @param {*} callback 
     * @param {*} params 
     */
    put(api,callback,params){
        let url = this.baseUrl + api ;
        let data = JSON.stringify(params);
        this.vueObj.$http.put(url, data,{emulateJSON:true})
        .then( res => {
            callback(JSON.parse(res.body));
        });
    }

    /**
     * delete方法
     * @param {*} api 
     * @param {*} callback 
     * @param {*} params 
     */
    delete(api,callback,params){
        let url = this.baseUrl + api ;
        let data = JSON.stringify(params);
        this.vueObj.$http.delete(url, data ,{emulateJSON:true})
        .then( res => {
            callback(JSON.parse(res.body));
        });
    }
}