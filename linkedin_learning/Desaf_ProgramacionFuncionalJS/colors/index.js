const colorList = document.getElementById('colorList');
const colors = {
    red: [255,0,0],
    blue: [0,0,255],
    yellow: [255,255,0],
    white: [255,255,255],
    black: [0,0,0],
};

function buildButtonColors() {
    Object.keys(colors).forEach(key=>{
        const button = document.createElement('button');
        button.style.backgroundColor = stringRGBGenerator(colors[key]);
        button.innerText = key;
        colorList.append(button);
    });
}

buildButtonColors();


function stringRGBGenerator(arrColor) {
    return `rgb(${arrColor[0]},${arrColor[1]},${arrColor[2]})`;
}

function mixerChannelColor(colorA, colorB) {
    var channelA = colorA * 0.5;
    var channelB = colorB * (1 - 0.5);
    return parseInt(channelA + channelB);
}

function mixerColors(rgbA, rgbB) {
    var r = mixerChannelColor(rgbA[0], rgbB[0]);
    var g = mixerChannelColor(rgbA[1], rgbB[1]);
    var b = mixerChannelColor(rgbA[2], rgbB[2]);
    return stringRGBGenerator([r,g,b])
}


const { Subject, fromEvent, combineLatest } = rxjs;
const { map, filter } = rxjs.operators;


const color1$ = new Subject(null);
const color2$ = new Subject(null);
let changing = true;

fromEvent(document.body, 'click')
.pipe(filter(e => e.target.tagName === 'BUTTON'), 
map(e=>e.target.innerText.toLowerCase()))
.subscribe(color=> {
    if(changing) {
        color1$.next(color);
    } else {
        color2$.next(color);
    }
    changing = !changing;
});

combineLatest([color1$, color2$])
.pipe(map(([col1, col2]) => mixerColors(colors[col1], colors[col2])))
.subscribe(colorMix => document.body.style.background = colorMix)