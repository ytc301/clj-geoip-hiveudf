# clj-geoip-hiveudf

`clj-geoip-hiveudf` is a Hadoop Hive UDF wrapper around [`clj-geoip`](https://github.com/bertschneider/clj-geoip),
itself "a thin [Clojure](http://www.clojure.com) layer on top
of the legacy [MaxMind GeoIP Java API](https://github.com/maxmind/geoip-api-java)."

## Usage

```
hive> add jar clj-geoip-hiveudf-<version>;
hive> create temporary function geoip as 'clj-geoip-hiveudf.hive.udf.Simple';
```

## Testing

This project is a wrapper around another author's core library, and he's already
provided test coverage for `clj-geoip` itself.

## Future / Enhancements

What's up next:

1. Re-implement UDF as a GenericUDF

Pull requests will be very happily considered.

__Maintained by Russell Whitaker__

## License

The MIT License (MIT)

Copyright (c) 2015 Russell Whitaker

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
