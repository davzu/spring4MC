var express = require('express');
var app = express();
var cors = require('cors');

app.use(cors());
const port = process.env.PORT || 3000;


app.get('/getURL', (req, res) => {
   res.end('https://yt3.ggpht.com/-svmpAtQZ_Tc/AAAAAAAAAAI/AAAAAAAAAAA/41N37I0zCko/s900-c-k-no-mo-rj-c0xffffff/photo.jpg');
})

app.listen(port, () => {
  console.log(`Example app listening at ${port}`);

});