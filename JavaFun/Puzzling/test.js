function humanformat (sec){
    y=Math.floor(sec/(86400*365))
    sec=sec%(86400*365)
    d=Math.floor(s/86400)
    sec=sec%86400
    h=Math.floor()
    sec=sec%3600
    m=Math.floor(sec/60)
    sec=sec%60

    console.log("Y",y,"d",d ,"m",m)
}
