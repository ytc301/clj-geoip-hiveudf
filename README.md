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

This project uses the [Speclj BDD testing framework](http://speclj.com/).

Write your tests first in `spec/clj-geoip-hiveudf/core_spec.clj`, run them expecting them to
fail, then implement your test-passing functions in `src/clj-geoip-hiveudf/core.clj`. Always
do this, running your tests on a regular rhythm along with your production code:

```bash
→ lein spec --reporter=d
Compiling clj-geoip-hiveudf.core
Compiling clj-geoip-hiveudf.hive.udf.Simple

Salutation
- should be warmly welcoming to Bob Dobbs

Valediction
- should be wistfully leave-taking of Bob Dobbs

Finished in 0.00035 seconds
2 examples, 0 failures
```

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
