const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootc171e/",
            name: "springbootc171e",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootc171e/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "鞋类秒杀商城"
        } 
    }
}
export default base
