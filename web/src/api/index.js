const axios = window.axios;

export default {
    async test(){
        const result = await axios.get('/api/test/info');
        return result;
    }
}
