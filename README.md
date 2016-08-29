# cljs-lein-project

A [re-frame](https://github.com/Day8/re-frame) application designed to ... well, that part is up to you.

## Development Mode

### Run application:

```
lein clean
lein figwheel dev
```

Figwheel will automatically push cljs changes to the browser.

Wait a bit, then browse to [http://localhost:3449](http://localhost:3449).


### Run clojure server:

```
lein run
```
Wait a bit, then browse to [http://localhost:8000](http://localhost:8000).

## Production Build

To compile clojurescript to javascript:

```
lein clean
lein cljsbuild once min
```
